package com.ksy.recordlib.service.core;

public class KSYStreamerConfig
{
    int mSampleAudioRateInHz;
    final int mAudioChannels = 1;
    int mFrameRate;
    int mMaxAverageVideoBitrate;
    int mMinAverageVideoBitrate;
    int mInitAverageVideoBitrate;
    int mAudioBitrate;
    int mVideoResolution;
    int mIFrameInterval;
    boolean mEncodeWith265;
    boolean mDefaultFront;
    boolean mDefaultLandscape;
    boolean mAutoAdjustBitrate;
    boolean mEnableStreamStatModule;
    boolean isFrontCameraMirror;
    KSYStreamerConfig.ENCODE_METHOD mEncodeMethod;
    boolean manualFocus;
    boolean mMuteAudio;
    boolean mFrontCameraMirror;
    String mUrl;

    public KSYStreamerConfig(KSYStreamerConfig.Builder paramBuilder)
    {
        this.mSampleAudioRateInHz = KSYStreamerConfig.Builder.access$000(paramBuilder);
        this.mFrameRate = KSYStreamerConfig.Builder.access$100(paramBuilder);
        this.mMaxAverageVideoBitrate = KSYStreamerConfig.Builder.access$200(paramBuilder);
        this.mMinAverageVideoBitrate = KSYStreamerConfig.Builder.access$300(paramBuilder);
        this.mInitAverageVideoBitrate = KSYStreamerConfig.Builder.access$400(paramBuilder);
        this.mAudioBitrate = KSYStreamerConfig.Builder.access$500(paramBuilder);
        this.mVideoResolution = KSYStreamerConfig.Builder.access$600(paramBuilder);
        this.mIFrameInterval = KSYStreamerConfig.Builder.access$700(paramBuilder);
        this.mEncodeWith265 = KSYStreamerConfig.Builder.access$800(paramBuilder);
        this.mDefaultFront = KSYStreamerConfig.Builder.access$900(paramBuilder);
        this.mDefaultLandscape = KSYStreamerConfig.Builder.access$1000(paramBuilder);
        this.mAutoAdjustBitrate = KSYStreamerConfig.Builder.access$1100(paramBuilder);
        this.mUrl = KSYStreamerConfig.Builder.access$1200(paramBuilder);
        this.mEncodeMethod = KSYStreamerConfig.Builder.access$1300(paramBuilder);
        this.mEnableStreamStatModule = KSYStreamerConfig.Builder.access$1400(paramBuilder);
        this.mMuteAudio = KSYStreamerConfig.Builder.access$1500(paramBuilder);
        this.mFrontCameraMirror = KSYStreamerConfig.Builder.access$1600(paramBuilder);
        this.manualFocus = KSYStreamerConfig.Builder.access$1700(paramBuilder);
    }

    public void setFrontCameraMirror(boolean paramBoolean)
    {
        this.isFrontCameraMirror = paramBoolean;
    }

    public int getSampleAudioRateInHz()
    {
        return this.mSampleAudioRateInHz;
    }

    public void setSampleAudioRateInHz(int paramInt)
    {
        this.mSampleAudioRateInHz = paramInt;
    }

    public int getAudioChannels()
    {
        return 1;
    }

    public int getFrameRate()
    {
        return this.mFrameRate;
    }

    public void setFrameRate(int paramInt)
    {
        this.mFrameRate = paramInt;
    }

    public int getMaxAverageVideoBitrate()
    {
        return this.mMaxAverageVideoBitrate;
    }

    public void setMaxAverageVideoBitrate(int paramInt)
    {
        this.mMaxAverageVideoBitrate = paramInt;
    }

    public int getMinAverageVideoBitrate()
    {
        return this.mMinAverageVideoBitrate;
    }

    public void setMinAverageVideoBitrate(int paramInt)
    {
        this.mMinAverageVideoBitrate = paramInt;
    }

    public int getInitAverageVideoBitrate()
    {
        return this.mInitAverageVideoBitrate;
    }

    public void setInitAverageVideoBitrate(int paramInt)
    {
        this.mInitAverageVideoBitrate = paramInt;
    }

    public int getAudioBitrate()
    {
        return this.mAudioBitrate;
    }

    public void setAudioBitrate(int paramInt)
    {
        this.mAudioBitrate = paramInt;
    }

    public void setMuteAudio(boolean paramBoolean)
    {
        this.mMuteAudio = paramBoolean;
    }

    public int getVideoResolution()
    {
        return this.mVideoResolution;
    }

    public void setVideoResolution(int paramInt)
    {
        this.mVideoResolution = paramInt;
    }

    public int getIFrameInterval()
    {
        return this.mIFrameInterval;
    }

    public void setIFrameInterval(int paramInt)
    {
        this.mIFrameInterval = paramInt;
    }

    public boolean isEncodeWith265()
    {
        return this.mEncodeWith265;
    }

    public boolean isMuteAudio()
    {
        return this.mMuteAudio;
    }

    public boolean isFrontCameraMirror()
    {
        return this.mFrontCameraMirror;
    }

    public void setEncodeWith265(boolean paramBoolean)
    {
        this.mEncodeWith265 = paramBoolean;
    }

    public void setDefaultFront(boolean paramBoolean)
    {
        this.mDefaultFront = paramBoolean;
    }

    public boolean getDefaultFront()
    {
        return this.mDefaultFront;
    }

    public boolean isEnableStreamStatModule()
    {
        return this.mEnableStreamStatModule;
    }

    public void setEnableStreamStatModule(boolean paramBoolean)
    {
        this.mEnableStreamStatModule = paramBoolean;
    }

    public boolean getDefaultLandscape()
    {
        return this.mDefaultLandscape;
    }

    public void setDefaultLanscape(boolean paramBoolean)
    {
        this.mDefaultLandscape = paramBoolean;
    }

    public String getUrl()
    {
        return this.mUrl;
    }

    public void setUrl(String paramString)
    {
        this.mUrl = paramString;
    }

    public boolean isAutoAdjustBitrate()
    {
        return this.mAutoAdjustBitrate;
    }

    public void setAutoAdjustBitrate(boolean paramBoolean)
    {
        this.mAutoAdjustBitrate = paramBoolean;
    }

    public KSYStreamerConfig.ENCODE_METHOD getEncodeMethod()
    {
        return this.mEncodeMethod;
    }

    public KSYStreamerConfig setEncodeMethod(KSYStreamerConfig.ENCODE_METHOD paramENCODE_METHOD)
    {
        this.mEncodeMethod = paramENCODE_METHOD;
        return this;
    }

    public boolean isManualFocus()
    {
        return this.manualFocus;
    }

    public KSYStreamerConfig setManualFocus(boolean paramBoolean)
    {
        this.manualFocus = paramBoolean;
        return this;
    }
}